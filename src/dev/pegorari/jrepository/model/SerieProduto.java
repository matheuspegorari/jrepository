package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SerieProduto extends AbstractSankhyaEntity<SerieProduto> {
   private BigDecimal atualEstoque;
   private String avariado;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private String serie;
   private String serieFab;
   private String smartCard;

   public BigDecimal getAtualEstoque() {
        return atualEstoque;
   }

   public void setAtualEstoque(BigDecimal atualEstoque) {
        markAsChanged("ATUALESTOQUE", atualEstoque);
        this.atualEstoque = atualEstoque;
   }

   public String getAvariado() {
        return avariado;
   }

   public void setAvariado(String avariado) {
        markAsChanged("AVARIADO", avariado);
        this.avariado = avariado;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
        this.serie = serie;
   }

   public String getSerieFab() {
        return serieFab;
   }

   public void setSerieFab(String serieFab) {
        markAsChanged("SERIEFAB", serieFab);
        this.serieFab = serieFab;
   }

   public String getSmartCard() {
        return smartCard;
   }

   public void setSmartCard(String smartCard) {
        markAsChanged("SMARTCARD", smartCard);
        this.smartCard = smartCard;
   }

   @Override
   public String getTableName() {
        return "TGFSER";
   }

   @Override
   public String getEntityName() {
        return "SerieProduto";
   }

   @Override
   public SerieProduto fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.atualEstoque = vo.asBigDecimal("ATUALESTOQUE");
        this.avariado = vo.asString("AVARIADO");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.serie = vo.asString("SERIE");
        this.serieFab = vo.asString("SERIEFAB");
        this.smartCard = vo.asString("SMARTCARD");
        return this;
   }
}
