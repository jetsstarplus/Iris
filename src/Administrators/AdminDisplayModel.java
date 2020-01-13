/*
 * The MIT License
 *
 * Copyright 2019 User.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package Administrators;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 * This class designs the table and how elements will appear in it
 */
public class AdminDisplayModel extends AbstractTableModel{
    private String[] columns;
    private Object[][] rows;

    public AdminDisplayModel() {
    }

    public AdminDisplayModel(Object[][] rows, String[] columns) {
        this.columns = columns;
        this.rows = rows;
    }

    @Override
    public Class getColumnClass(int col)
    {
        return getValueAt(0, col).getClass();
    }
            
    @Override
    public int getRowCount() {
         return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col)
    {
        return this.columns[col];
    }
}
