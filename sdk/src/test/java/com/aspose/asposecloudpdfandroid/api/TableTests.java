/**
 *
 *   Copyright (c) 2020 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of TestHelper.getInstance() software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.aspose.asposecloudpdfandroid.api;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.model.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TableTests {
    private TestHelper th;

    public TableTests() throws ApiException {
        th = TestHelper.getInstance();
    }


    /**
     * GetDocumentTablesTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTablesTest()throws ApiException
    {
        String name = "PdfWithTable.pdf";
        th.uploadFile(name);

        TablesRecognizedResponse response = th.pdfApi.getDocumentTables(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeleteDocumentTablesTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentTablesTest()throws ApiException
    {
        String name = "PdfWithTable.pdf";
        th.uploadFile(name);

        AsposeResponse response = th.pdfApi.deleteDocumentTables(name, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetPageTablesTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageTablesTest()throws ApiException
    {
        String name = "PdfWithTable.pdf";
        th.uploadFile(name);
        int pageNumber = 1;

        TablesRecognizedResponse response = th.pdfApi.getPageTables(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeletePageTablesTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageTablesTest()throws ApiException
    {
        String name = "PdfWithTable.pdf";
        th.uploadFile(name);
        int pageNumber = 1;

        AsposeResponse response = th.pdfApi.deletePageTables(name, pageNumber, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetTableTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTableTest()throws ApiException
    {
        String name = "PdfWithTable.pdf";
        th.uploadFile(name);

        TablesRecognizedResponse tablesResponse = th.pdfApi.getDocumentTables(name, null, th.tempFolder);
        assertEquals(200, (int)tablesResponse.getCode());
        String tableId = tablesResponse.getTables().getList().get(0).getId();

        TableRecognizedResponse response = th.pdfApi.getTable(name, tableId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * DeleteTableTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTableTest()throws ApiException
    {
        String name = "PdfWithTable.pdf";
        th.uploadFile(name);

        TablesRecognizedResponse tablesResponse = th.pdfApi.getDocumentTables(name, null, th.tempFolder);
        assertEquals(200, (int)tablesResponse.getCode());
        String tableId = tablesResponse.getTables().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.deleteTable(name, tableId, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostPageTablesTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPageTablesTest()throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        List<Table> tables = new ArrayList<>();
        tables.add(drawTable());

        AsposeResponse response = th.pdfApi.postPageTables(name, pageNumber, tables, null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutTableTest
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTableTest()throws ApiException
    {
        String name = "PdfWithTable.pdf";
        th.uploadFile(name);

        int pageNumber = 1;

        TablesRecognizedResponse tablesResponse = th.pdfApi.getDocumentTables(name, null, th.tempFolder);
        assertEquals(200, (int)tablesResponse.getCode());
        String tableId = tablesResponse.getTables().getList().get(0).getId();

        AsposeResponse response = th.pdfApi.putTable(name, tableId, drawTable(), null, th.tempFolder);
        assertEquals(200, (int)response.getCode());
    }

    private Table drawTable()
    {
        TextState textState = new TextState()
                .fontSize(10.)
                .backgroundColor(new Color().A(255).R(255));

        int numOfCols = 5;
        int numOfRows = 5;

        Table table = new Table();
        table.setRows(new ArrayList<Row>());

        String colWidths = "";
        for (int c = 0; c < numOfCols; c++)
        {
            colWidths += " 30";
        }
        table.columnWidths(colWidths);

        table.defaultCellTextState(textState);

        GraphInfo borderTableBorder = new GraphInfo();
        borderTableBorder.setColor(new Color().A(255).G(255));
        borderTableBorder.setLineWidth(1.);

        table.setDefaultCellBorder(new BorderInfo()
                .top(borderTableBorder)
                .right(borderTableBorder)
                .bottom(borderTableBorder)
                .left(borderTableBorder)
        );

        table.setTop(100.);

        for (int r = 0; r < numOfRows; r++)
        {

            Row row = new Row().cells(new ArrayList<Cell>());

            for (int c = 0; c < numOfCols; c++)
            {

                Cell cell = new Cell();
                cell.setBackgroundColor(new Color().A(255).G(128));
                cell.setDefaultCellTextState(textState);
                cell.setParagraphs(new ArrayList<TextRect>());
                cell.getParagraphs().add(new TextRect().text("value"));

                // change properties on cell
                if (c == 1)
                {
                    cell.getDefaultCellTextState().setForegroundColor(new Color().A(255).B(255));
                }

                // change properties on cell AFTER first clearing and re-adding paragraphs
                else if (c == 2)
                {
                    cell.getParagraphs().clear();
                    cell.getParagraphs().add(new TextRect().text("y"));
                    cell.getDefaultCellTextState().setForegroundColor(new Color().A(255).B(255));
                }

                // change properties on paragraph
                else if (c == 3)
                {
                    cell.getParagraphs().get(0).setTextState(textState);
                    cell.getParagraphs().get(0).getTextState().setForegroundColor(new Color().A(255).G(255));
                }

                // change properties on paragraph AFTER first clearing and re-adding paragraphs
                else if (c == 4)
                {
                    cell.getParagraphs().clear();
                    cell.getParagraphs().add(new TextRect().text("y"));
                    cell.getParagraphs().get(0).setTextState(textState);
                    cell.getParagraphs().get(0).getTextState().setForegroundColor(new Color().A(255).B(255));
                }
                row.getCells().add(cell);

            }
            table.getRows().add(row);
        }

        return table;
    }
}
