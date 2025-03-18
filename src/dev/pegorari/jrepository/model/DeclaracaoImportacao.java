package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DeclaracaoImportacao extends AbstractSankhyaEntity<DeclaracaoImportacao> {
   private BigDecimal codUfDesemb;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal docImp;
   private Timestamp dtDesembaraco;
   private Timestamp dtPagCofins;
   private Timestamp dtPagPis;
   private Timestamp dtRegistro;
   private String locDesembaraco;
   private String nroDocumento;
   private String numAcDraw;
   private BigDecimal nuNota;
   private BigDecimal seqDi;
   private BigDecimal sequencia;
   private BigDecimal vlrCofinsImp;
   private BigDecimal vlrPisImp;
   private String codExportador;
   private String ufAdquirente;
   private String cnpjAdquirente;
   private String viaTransp;
   private String tipProcImp;
   private BigDecimal vlrAfrmm;

   public BigDecimal getCodUfDesemb() {
        return codUfDesemb;
   }

   public void setCodUfDesemb(BigDecimal codUfDesemb) {
        markAsChanged("CODUFDESEMB", codUfDesemb);
        this.codUfDesemb = codUfDesemb;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getDocImp() {
        return docImp;
   }

   public void setDocImp(BigDecimal docImp) {
        markAsChanged("DOCIMP", docImp);
        this.docImp = docImp;
   }

   public Timestamp getDtDesembaraco() {
        return dtDesembaraco;
   }

   public void setDtDesembaraco(Timestamp dtDesembaraco) {
        markAsChanged("DTDESEMBARACO", dtDesembaraco);
        this.dtDesembaraco = dtDesembaraco;
   }

   public Timestamp getDtPagCofins() {
        return dtPagCofins;
   }

   public void setDtPagCofins(Timestamp dtPagCofins) {
        markAsChanged("DTPAGCOFINS", dtPagCofins);
        this.dtPagCofins = dtPagCofins;
   }

   public Timestamp getDtPagPis() {
        return dtPagPis;
   }

   public void setDtPagPis(Timestamp dtPagPis) {
        markAsChanged("DTPAGPIS", dtPagPis);
        this.dtPagPis = dtPagPis;
   }

   public Timestamp getDtRegistro() {
        return dtRegistro;
   }

   public void setDtRegistro(Timestamp dtRegistro) {
        markAsChanged("DTREGISTRO", dtRegistro);
        this.dtRegistro = dtRegistro;
   }

   public String getLocDesembaraco() {
        return locDesembaraco;
   }

   public void setLocDesembaraco(String locDesembaraco) {
        markAsChanged("LOCDESEMBARACO", locDesembaraco);
        this.locDesembaraco = locDesembaraco;
   }

   public String getNroDocumento() {
        return nroDocumento;
   }

   public void setNroDocumento(String nroDocumento) {
        markAsChanged("NRODOCUMENTO", nroDocumento);
        this.nroDocumento = nroDocumento;
   }

   public String getNumAcDraw() {
        return numAcDraw;
   }

   public void setNumAcDraw(String numAcDraw) {
        markAsChanged("NUMACDRAW", numAcDraw);
        this.numAcDraw = numAcDraw;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqDi() {
        return seqDi;
   }

   public void setSeqDi(BigDecimal seqDi) {
        markAsChanged("SEQDI", seqDi);
        this.seqDi = seqDi;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getVlrCofinsImp() {
        return vlrCofinsImp;
   }

   public void setVlrCofinsImp(BigDecimal vlrCofinsImp) {
        markAsChanged("VLRCOFINSIMP", vlrCofinsImp);
        this.vlrCofinsImp = vlrCofinsImp;
   }

   public BigDecimal getVlrPisImp() {
        return vlrPisImp;
   }

   public void setVlrPisImp(BigDecimal vlrPisImp) {
        markAsChanged("VLRPISIMP", vlrPisImp);
        this.vlrPisImp = vlrPisImp;
   }

   public String getCodExportador() {
        return codExportador;
   }

   public void setCodExportador(String codExportador) {
        markAsChanged("CODEXPORTADOR", codExportador);
        this.codExportador = codExportador;
   }

   public String getUfAdquirente() {
        return ufAdquirente;
   }

   public void setUfAdquirente(String ufAdquirente) {
        markAsChanged("UFADQUIRENTE", ufAdquirente);
        this.ufAdquirente = ufAdquirente;
   }

   public String getCnpjAdquirente() {
        return cnpjAdquirente;
   }

   public void setCnpjAdquirente(String cnpjAdquirente) {
        markAsChanged("CNPJADQUIRENTE", cnpjAdquirente);
        this.cnpjAdquirente = cnpjAdquirente;
   }

   public String getViaTransp() {
        return viaTransp;
   }

   public void setViaTransp(String viaTransp) {
        markAsChanged("VIATRANSP", viaTransp);
        this.viaTransp = viaTransp;
   }

   public String getTipProcImp() {
        return tipProcImp;
   }

   public void setTipProcImp(String tipProcImp) {
        markAsChanged("TIPPROCIMP", tipProcImp);
        this.tipProcImp = tipProcImp;
   }

   public BigDecimal getVlrAfrmm() {
        return vlrAfrmm;
   }

   public void setVlrAfrmm(BigDecimal vlrAfrmm) {
        markAsChanged("VLRAFRMM", vlrAfrmm);
        this.vlrAfrmm = vlrAfrmm;
   }

   @Override
   public String getTableName() {
        return "TGFIDI";
   }

   @Override
   public String getEntityName() {
        return "DeclaracaoImportacao";
   }

   @Override
   public DeclaracaoImportacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codUfDesemb = vo.asBigDecimal("CODUFDESEMB");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.docImp = vo.asBigDecimal("DOCIMP");
        this.dtDesembaraco = vo.asTimestamp("DTDESEMBARACO");
        this.dtPagCofins = vo.asTimestamp("DTPAGCOFINS");
        this.dtPagPis = vo.asTimestamp("DTPAGPIS");
        this.dtRegistro = vo.asTimestamp("DTREGISTRO");
        this.locDesembaraco = vo.asString("LOCDESEMBARACO");
        this.nroDocumento = vo.asString("NRODOCUMENTO");
        this.numAcDraw = vo.asString("NUMACDRAW");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqDi = vo.asBigDecimal("SEQDI");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.vlrCofinsImp = vo.asBigDecimal("VLRCOFINSIMP");
        this.vlrPisImp = vo.asBigDecimal("VLRPISIMP");
        this.codExportador = vo.asString("CODEXPORTADOR");
        this.ufAdquirente = vo.asString("UFADQUIRENTE");
        this.cnpjAdquirente = vo.asString("CNPJADQUIRENTE");
        this.viaTransp = vo.asString("VIATRANSP");
        this.tipProcImp = vo.asString("TIPPROCIMP");
        this.vlrAfrmm = vo.asBigDecimal("VLRAFRMM");
        return this;
   }
}
