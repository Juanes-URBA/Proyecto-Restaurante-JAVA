public class ReporteIAService {

    private ReporteFinanciero reporte;
    private GemminiService gemmini;

    public ReporteIAService(Restaurante restaurante) {
        this.reporte = new ReporteFinanciero(restaurante);
        this.gemmini = new GemminiService();
    }
    public String reporteMensualIA(int mes, int anio) {
        String reporteBase = reporte.generarReporteMensual(mes, anio);
        return gemmini.generarAnalisis(reporteBase);
    }
    public String reporteAnualIA(int anio) {
        String reporteBase = reporte.generarReporteAnual(anio);
        return gemmini.generarAnalisis(reporteBase);
    }
}
