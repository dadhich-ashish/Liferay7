import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.liferay.portal.kernel.dao.jdbc.DataAccess;

Connection con = null;
Statement st = null;
try {
	con = DataAccess.getUpgradeOptimizedConnection();
	st = con.createStatement();
	ResultSet rs = st.executeQuery("SELECT * FROM User_");
	while (rs.next()) {
		for(int i = 1;i< rs.getMetaData().getColumnCount(); i++) {
			print(rs.getString(i) + " - ");
		}
		println();
	}
}
finally {
	DataAccess.cleanUp(con, st);
} 