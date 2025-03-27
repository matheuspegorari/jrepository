package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RomaneioWMS extends AbstractSankhyaEntity<RomaneioWMS> {
   public String getRecontado() {
        return this.getVo().asString("RECONTADO");
   }

   public void setRecontado(String recontado) {
        markAsChanged("RECONTADO", recontado);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public String getCodBarraConcat() {
        return this.getVo().asString("CODBARRACONCAT");
   }

   public void setCodBarraConcat(String codBarraConcat) {
        markAsChanged("CODBARRACONCAT", codBarraConcat);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getNuSeparacao() {
        return this.getVo().asBigDecimal("NUSEPARACAO");
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
   }

   public BigDecimal getQtdUnpad() {
        return this.getVo().asBigDecimal("QTDUNPAD");
   }

   public void setQtdUnpad(BigDecimal qtdUnpad) {
        markAsChanged("QTDUNPAD", qtdUnpad);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGWROM";
   }

   @Override
   public String getEntityName() {
        return "RomaneioWMS";
   }

   @Override
   public RomaneioWMS fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
