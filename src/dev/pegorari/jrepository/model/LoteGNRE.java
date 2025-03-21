package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LoteGNRE extends AbstractSankhyaEntity<LoteGNRE> {
   private BigDecimal codUsu;
   private Timestamp dhLote;
   private BigDecimal nroLoteGnre;
   private String nroProtLote;
   private BigDecimal qtdTit;
   private BigDecimal vlrTot;
   private char[] xmlLote;
   private String situacaoAtualLote;
   private String statusLote;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhLote() {
        return dhLote;
   }

   public void setDhLote(Timestamp dhLote) {
        markAsChanged("DHLOTE", dhLote);
        this.dhLote = dhLote;
   }

   public BigDecimal getNroLoteGnre() {
        return nroLoteGnre;
   }

   public void setNroLoteGnre(BigDecimal nroLoteGnre) {
        markAsChanged("NROLOTEGNRE", nroLoteGnre);
        this.nroLoteGnre = nroLoteGnre;
   }

   public String getNroProtLote() {
        return nroProtLote;
   }

   public void setNroProtLote(String nroProtLote) {
        markAsChanged("NROPROTLOTE", nroProtLote);
        this.nroProtLote = nroProtLote;
   }

   public BigDecimal getQtdTit() {
        return qtdTit;
   }

   public void setQtdTit(BigDecimal qtdTit) {
        markAsChanged("QTDTIT", qtdTit);
        this.qtdTit = qtdTit;
   }

   public BigDecimal getVlrTot() {
        return vlrTot;
   }

   public void setVlrTot(BigDecimal vlrTot) {
        markAsChanged("VLRTOT", vlrTot);
        this.vlrTot = vlrTot;
   }

   public char[] getXmlLote() {
        return xmlLote;
   }

   public void setXmlLote(char[] xmlLote) {
        markAsChanged("XMLLOTE", xmlLote);
        this.xmlLote = xmlLote;
   }

   public String getSituacaoAtualLote() {
        return situacaoAtualLote;
   }

   public void setSituacaoAtualLote(String situacaoAtualLote) {
        markAsChanged("SITUACAOATUALLOTE", situacaoAtualLote);
        this.situacaoAtualLote = situacaoAtualLote;
   }

   public String getStatusLote() {
        return statusLote;
   }

   public void setStatusLote(String statusLote) {
        markAsChanged("STATUSLOTE", statusLote);
        this.statusLote = statusLote;
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
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhLote = vo.asTimestamp("DHLOTE");
        this.nroLoteGnre = vo.asBigDecimal("NROLOTEGNRE");
        this.nroProtLote = vo.asString("NROPROTLOTE");
        this.qtdTit = vo.asBigDecimal("QTDTIT");
        this.vlrTot = vo.asBigDecimal("VLRTOT");
        this.xmlLote = vo.asClob("XMLLOTE");
        this.situacaoAtualLote = vo.asString("SITUACAOATUALLOTE");
        this.statusLote = vo.asString("STATUSLOTE");
        return this;
   }
}
