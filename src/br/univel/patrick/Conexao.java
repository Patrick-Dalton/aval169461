package br.univel.patrick;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class Conexao {
		private static Conexao self;
		
		private Connection con;
		
		private Conexao() {
			try {
				Class.forName("org.postgresql.Driver");
				this.con = DriverManager
						.getConnection(
						"jdbc:postgresql://localhost:5432/agenda",
						"postgres", "univel");
				
				Runtime.getRuntime()
					.addShutdownHook(new Thread(new Runnable() {
						@Override
						public void run() {
							try {
								Conexao.this.con.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}));
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		
		public final static synchronized Conexao getInstance() {
			if (self == null) {
				self = new Conexao();
			}
			return self;
		}
		
		public Connection getConnection() {
			return this.con;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException("Só haver um!");
		}
		
	

}

