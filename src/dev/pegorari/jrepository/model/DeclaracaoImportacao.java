package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DeclaracaoImportacao extends AbstractSankhyaEntity<DeclaracaoImportacao> {
   public BigDecimal getCodUfDesemb() {
        return this.getVo().asBigDecimal("CODUFDESEMB");
   }

   public void setCodUfDesemb(BigDecimal codUfDesemb) {
        markAsChanged("CODUFDESEMB", codUfDesemb);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getDocImp() {
        return this.getVo().asBigDecimal("DOCIMP");
   }

   public void setDocImp(BigDecimal docImp) {
        markAsChanged("DOCIMP", docImp);
   }

   public Timestamp getDtDesembaraco() {
        return this.getVo().asTimestamp("DTDESEMBARACO");
   }

   public void setDtDesembaraco(Timestamp dtDesembaraco) {
        markAsChanged("DTDESEMBARACO", dtDesembaraco);
   }

   public Timestamp getDtPagCofins() {
        return this.getVo().asTimestamp("DTPAGCOFINS");
   }

   public void setDtPagCofins(Timestamp dtPagCofins) {
        markAsChanged("DTPAGCOFINS", dtPagCofins);
   }

   public Timestamp getDtPagPis() {
        return this.getVo().asTimestamp("DTPAGPIS");
   }

   public void setDtPagPis(Timestamp dtPagPis) {
        markAsChanged("DTPAGPIS", dtPagPis);
   }

   public Timestamp getDtRegistro() {
        return this.getVo().asTimestamp("DTREGISTRO");
   }

   public void setDtRegistro(Timestamp dtRegistro) {
        markAsChanged("DTREGISTRO", dtRegistro);
   }

   public String getLocDesembaraco() {
        return this.getVo().asString("LOCDESEMBARACO");
   }

   public void setLocDesembaraco(String locDesembaraco) {
        markAsChanged("LOCDESEMBARACO", locDesembaraco);
   }

   public String getNroDocumento() {
        return this.getVo().asString("NRODOCUMENTO");
   }

   public void setNroDocumento(String nroDocumento) {
        markAsChanged("NRODOCUMENTO", nroDocumento);
   }

   public String getNumAcDraw() {
        return this.getVo().asString("NUMACDRAW");
   }

   public void setNumAcDraw(String numAcDraw) {
        markAsChanged("NUMACDRAW", numAcDraw);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSeqDi() {
        return this.getVo().asBigDecimal("SEQDI");
   }

   public void setSeqDi(BigDecimal seqDi) {
        markAsChanged("SEQDI", seqDi);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getVlrCofinsImp() {
        return this.getVo().asBigDecimal("VLRCOFINSIMP");
   }

   public void setVlrCofinsImp(BigDecimal vlrCofinsImp) {
        markAsChanged("VLRCOFINSIMP", vlrCofinsImp);
   }

   public BigDecimal getVlrPisImp() {
        return this.getVo().asBigDecimal("VLRPISIMP");
   }

   public void setVlrPisImp(BigDecimal vlrPisImp) {
        markAsChanged("VLRPISIMP", vlrPisImp);
   }

   public String getCodExportador() {
        return this.getVo().asString("CODEXPORTADOR");
   }

   public void setCodExportador(String codExportador) {
        markAsChanged("CODEXPORTADOR", codExportador);
   }

   public String getUfAdquirente() {
        return this.getVo().asString("UFADQUIRENTE");
   }

   public void setUfAdquirente(String ufAdquirente) {
        markAsChanged("UFADQUIRENTE", ufAdquirente);
   }

   public String getCnpjAdquirente() {
        return this.getVo().asString("CNPJADQUIRENTE");
   }

   public void setCnpjAdquirente(String cnpjAdquirente) {
        markAsChanged("CNPJADQUIRENTE", cnpjAdquirente);
   }

   public String getViaTransp() {
        return this.getVo().asString("VIATRANSP");
   }

   public void setViaTransp(String viaTransp) {
        markAsChanged("VIATRANSP", viaTransp);
   }

   public String getTipProcImp() {
        return this.getVo().asString("TIPPROCIMP");
   }

   public void setTipProcImp(String tipProcImp) {
        markAsChanged("TIPPROCIMP", tipProcImp);
   }

   public BigDecimal getVlrAfrmm() {
        return this.getVo().asBigDecimal("VLRAFRMM");
   }

   public void setVlrAfrmm(BigDecimal vlrAfrmm) {
        markAsChanged("VLRAFRMM", vlrAfrmm);
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
        this.setVo(vo);
        return this;
   }
}
