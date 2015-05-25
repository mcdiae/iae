package boilerplate.test;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CodingStandardsTest {

    private static String[] sourceDirectories = { "../boilerplate/src",
            "../boilerplateProcessor/src", "./test-code", "./junit" };

    private static void addJavaFiles(final File dir,
            final Collection<Object[]> collection) {
        dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isFile() && file.getName().endsWith(".java")) {
                    collection.add(new Object[] { file });
                } else if (file.isDirectory()) {
                    addJavaFiles(file, collection);
                }
                return false;
            }
        });
    }

    @Parameters
    public static Collection<Object[]> getFiles() {
        Collection<Object[]> params = new ArrayList<Object[]>();
        for (String src : sourceDirectories) {
            File dir = new File(src);
            addJavaFiles(dir, params);
        }
        return params;
    }

    private File file;

    public CodingStandardsTest(File file) {
        this.file = file;
    }

    /**
     * Whitespace wars!
     * 
     * Project standard is to use spaces. .java files fail if they contain tab
     * characters.
     * 
     * @throws IOException
     */
    @Test
    public void failOnTabs() throws IOException {
        InputStream in = new FileInputStream(file);
        try {
            Reader reader = new InputStreamReader(in, "UTF-8");
            try {
                LineNumberReader lineReader = new LineNumberReader(reader);
                try {
                    failOnTab(lineReader);
                } finally {
                    lineReader.close();
                }
            } finally {
                reader.close();
            }
        } finally {
            in.close();
        }
    }

    private void failOnTab(LineNumberReader sourceFile) throws IOException {
        while (true) {
            String line = sourceFile.readLine();
            if (line == null) {
                return;
            }
            if (line.contains("\t")) {
                Assert.fail("File: " + file.getName() + ". Line: "
                        + sourceFile.getLineNumber()
                        + ". Contains tab character.");
            }
        }
    }

}
