public class ReporteFinanciero {
    private Restaurante restaurante;

    public ReporteFinanciero(Restaurante restaurante){
        this.restaurante = restaurante; 
    }
    public String generarReporteMensual(int mes, int anio){
        int totalIngresos = 0;

        for (Pedido p: restaurante.getPedidos().values()) {
            totalIngresos += p.getTotal();
        }
        return """
        REPORTE MENSUAL
        Mes: %d
        Año: %d
        Total pedidos: %d
        Total ingresos: $%d
        """.formatted(
                mes,
                anio,
                restaurante.getPedidos().size(),
                totalIngresos
        );
    }
    public String generarReporteAnual(int anio) {
        int totalIngresos = 0;

        for (Pedido p : restaurante.getPedidos().values()) {
            totalIngresos += p.getTotal();
        }

        return """
        REPORTE ANUAL
        Año: %d
        Total ingresos: $%d
        """.formatted(anio, totalIngresos);
    }
}
