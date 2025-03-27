package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SerieProduto extends AbstractSankhyaEntity<SerieProduto> {
   public BigDecimal getAtualEstoque() {
        return this.getVo().asBigDecimal("ATUALESTOQUE");
   }

   public void setAtualEstoque(BigDecimal atualEstoque) {
        markAsChanged("ATUALESTOQUE", atualEstoque);
   }

   public String getAvariado() {
        return this.getVo().asString("AVARIADO");
   }

   public void setAvariado(String avariado) {
        markAsChanged("AVARIADO", avariado);
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

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public String getSerieFab() {
        return this.getVo().asString("SERIEFAB");
   }

   public void setSerieFab(String serieFab) {
        markAsChanged("SERIEFAB", serieFab);
   }

   public String getSmartCard() {
        return this.getVo().asString("SMARTCARD");
   }

   public void setSmartCard(String smartCard) {
        markAsChanged("SMARTCARD", smartCard);
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
        this.setVo(vo);
        return this;
   }
}
