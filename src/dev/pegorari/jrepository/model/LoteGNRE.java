package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LoteGNRE extends AbstractSankhyaEntity<LoteGNRE> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhLote() {
        return this.getVo().asTimestamp("DHLOTE");
   }

   public void setDhLote(Timestamp dhLote) {
        markAsChanged("DHLOTE", dhLote);
   }

   public BigDecimal getNroLoteGnre() {
        return this.getVo().asBigDecimal("NROLOTEGNRE");
   }

   public void setNroLoteGnre(BigDecimal nroLoteGnre) {
        markAsChanged("NROLOTEGNRE", nroLoteGnre);
   }

   public String getNroProtLote() {
        return this.getVo().asString("NROPROTLOTE");
   }

   public void setNroProtLote(String nroProtLote) {
        markAsChanged("NROPROTLOTE", nroProtLote);
   }

   public BigDecimal getQtdTit() {
        return this.getVo().asBigDecimal("QTDTIT");
   }

   public void setQtdTit(BigDecimal qtdTit) {
        markAsChanged("QTDTIT", qtdTit);
   }

   public BigDecimal getVlrTot() {
        return this.getVo().asBigDecimal("VLRTOT");
   }

   public void setVlrTot(BigDecimal vlrTot) {
        markAsChanged("VLRTOT", vlrTot);
   }

   public char[] getXmlLote() {
        return this.getVo().asClob("XMLLOTE");
   }

   public void setXmlLote(char[] xmlLote) {
        markAsChanged("XMLLOTE", xmlLote);
   }

   public String getSituacaoAtualLote() {
        return this.getVo().asString("SITUACAOATUALLOTE");
   }

   public void setSituacaoAtualLote(String situacaoAtualLote) {
        markAsChanged("SITUACAOATUALLOTE", situacaoAtualLote);
   }

   public String getStatusLote() {
        return this.getVo().asString("STATUSLOTE");
   }

   public void setStatusLote(String statusLote) {
        markAsChanged("STATUSLOTE", statusLote);
   }

   @Override
   public String getTableName() {
        return "TGFLGNRE";
   }

   @Override
   public String getEntityName() {
        return "LoteGNRE";
   }

   @Override
   public LoteGNRE fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
