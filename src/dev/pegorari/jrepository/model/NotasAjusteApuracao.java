package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasAjusteApuracao extends AbstractSankhyaEntity<NotasAjusteApuracao> {
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private String convProduzir;
   private Timestamp dtAjuste;
   private Timestamp dtAlter;
   private Timestamp dtDoc;
   private BigDecimal nuAja;
   private BigDecimal numDoc;
   private BigDecimal nuNota;
   private BigDecimal seqAja;
   private BigDecimal sequencia;
   private String serieNota;
   private BigDecimal vlrAjuste;
   private BigDecimal codModDoc;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getConvProduzir() {
        return convProduzir;
   }

   public void setConvProduzir(String convProduzir) {
        this.convProduzir = convProduzir;
   }

   public Timestamp getDtAjuste() {
        return dtAjuste;
   }

   public void setDtAjuste(Timestamp dtAjuste) {
        this.dtAjuste = dtAjuste;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtDoc() {
        return dtDoc;
   }

   public void setDtDoc(Timestamp dtDoc) {
        this.dtDoc = dtDoc;
   }

   public BigDecimal getNuAja() {
        return nuAja;
   }

   public void setNuAja(BigDecimal nuAja) {
        this.nuAja = nuAja;
   }

   public BigDecimal getNumDoc() {
        return numDoc;
   }

   public void setNumDoc(BigDecimal numDoc) {
        this.numDoc = numDoc;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqAja() {
        return seqAja;
   }

   public void setSeqAja(BigDecimal seqAja) {
        this.seqAja = seqAja;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
   }

   public BigDecimal getVlrAjuste() {
        return vlrAjuste;
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        this.vlrAjuste = vlrAjuste;
   }

   public BigDecimal getCodModDoc() {
        return codModDoc;
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        this.codModDoc = codModDoc;
   }

   @Override
   public String getTableName() {
        return "TGFAJN";
   }

   @Override
   public String getEntityName() {
        return "NotasAjusteApuracao";
   }

   @Override
   public NotasAjusteApuracao fromVO(DynamicVO vo) {
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.convProduzir = vo.asString("CONVPRODUZIR");
        this.dtAjuste = vo.asTimestamp("DTAJUSTE");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtDoc = vo.asTimestamp("DTDOC");
        this.nuAja = vo.asBigDecimal("NUAJA");
        this.numDoc = vo.asBigDecimal("NUMDOC");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqAja = vo.asBigDecimal("SEQAJA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.serieNota = vo.asString("SERIENOTA");
        this.vlrAjuste = vo.asBigDecimal("VLRAJUSTE");
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        return this;
   }
}
