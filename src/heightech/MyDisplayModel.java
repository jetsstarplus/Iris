
package heightech;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */

// This class is for displaying the items in the Admin panel
public class MyDisplayModel extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    public MyDisplayModel() {
    }

    /**
     *
     * @param rows
     * @param columns
     */
    public MyDisplayModel(Object[][] rows, String[] columns) {
        this.columns = columns;
        this.rows = rows;
    }
    
    @Override
    public Class getColumnClass(int col)
    {
        // The image is in column 7 in the database
        if(col == 8)
        {
            return(Icon.class);
        }
        
        else
        {
            return getValueAt(0, col).getClass();
        }
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
