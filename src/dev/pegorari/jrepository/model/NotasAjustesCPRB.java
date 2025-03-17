package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasAjustesCPRB implements SankhyaEntity<NotasAjustesCPRB> {

   private BigDecimal codAjuste;
   private String codCprb;
   private BigDecimal codEmp;
   private String codObra;
   private BigDecimal codProd;
   private Timestamp dhMov;
   private Timestamp dtDoc;
   private Timestamp dtRef;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private BigDecimal tipoAjuste;
   private BigDecimal vlrAjuste;

   public BigDecimal getCodAjuste() {
        return codAjuste;
   }

   public void setCodAjuste(BigDecimal codAjuste) {
        this.codAjuste = codAjuste;
   }

   public String getCodCprb() {
        return codCprb;
   }

   public void setCodCprb(String codCprb) {
        this.codCprb = codCprb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getCodObra() {
        return codObra;
   }

   public void setCodObra(String codObra) {
        this.codObra = codObra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public Timestamp getDhMov() {
        return dhMov;
   }

   public void setDhMov(Timestamp dhMov) {
        this.dhMov = dhMov;
   }

   public Timestamp getDtDoc() {
        return dtDoc;
   }

   public void setDtDoc(Timestamp dtDoc) {
        this.dtDoc = dtDoc;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getTipoAjuste() {
        return tipoAjuste;
   }

   public void setTipoAjuste(BigDecimal tipoAjuste) {
        this.tipoAjuste = tipoAjuste;
   }

   public BigDecimal getVlrAjuste() {
        return vlrAjuste;
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        this.vlrAjuste = vlrAjuste;
   }

   @Override
   public String getEntityName() {
        return "NotasAjustesCPRB";
   }

   @Override
   public NotasAjustesCPRB fromVO(DynamicVO vo) {
        this.codAjuste = vo.asBigDecimal("CODAJUSTE");
        this.codCprb = vo.asString("CODCPRB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codObra = vo.asString("CODOBRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.dhMov = vo.asTimestamp("DHMOV");
        this.dtDoc = vo.asTimestamp("DTDOC");
        this.dtRef = vo.asTimestamp("DTREF");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoAjuste = vo.asBigDecimal("TIPOAJUSTE");
        this.vlrAjuste = vo.asBigDecimal("VLRAJUSTE");
        return this;
   }
}
