package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasAjusteApuracao extends AbstractSankhyaEntity<NotasAjusteApuracao> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getConvProduzir() {
        return this.getVo().asString("CONVPRODUZIR");
   }

   public void setConvProduzir(String convProduzir) {
        markAsChanged("CONVPRODUZIR", convProduzir);
   }

   public Timestamp getDtAjuste() {
        return this.getVo().asTimestamp("DTAJUSTE");
   }

   public void setDtAjuste(Timestamp dtAjuste) {
        markAsChanged("DTAJUSTE", dtAjuste);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtDoc() {
        return this.getVo().asTimestamp("DTDOC");
   }

   public void setDtDoc(Timestamp dtDoc) {
        markAsChanged("DTDOC", dtDoc);
   }

   public BigDecimal getNuAja() {
        return this.getVo().asBigDecimal("NUAJA");
   }

   public void setNuAja(BigDecimal nuAja) {
        markAsChanged("NUAJA", nuAja);
   }

   public BigDecimal getNumDoc() {
        return this.getVo().asBigDecimal("NUMDOC");
   }

   public void setNumDoc(BigDecimal numDoc) {
        markAsChanged("NUMDOC", numDoc);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSeqAja() {
        return this.getVo().asBigDecimal("SEQAJA");
   }

   public void setSeqAja(BigDecimal seqAja) {
        markAsChanged("SEQAJA", seqAja);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public BigDecimal getVlrAjuste() {
        return this.getVo().asBigDecimal("VLRAJUSTE");
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        markAsChanged("VLRAJUSTE", vlrAjuste);
   }

   public BigDecimal getCodModDoc() {
        return this.getVo().asBigDecimal("CODMODDOC");
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
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
        this.setVo(vo);
        return this;
   }
}
