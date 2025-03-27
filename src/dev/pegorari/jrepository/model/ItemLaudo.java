package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemLaudo extends AbstractSankhyaEntity<ItemLaudo> {
   public BigDecimal getCodClc() {
        return this.getVo().asBigDecimal("CODCLC");
   }

   public void setCodClc(BigDecimal codClc) {
        markAsChanged("CODCLC", codClc);
   }

   public BigDecimal getCodClt() {
        return this.getVo().asBigDecimal("CODCLT");
   }

   public void setCodClt(BigDecimal codClt) {
        markAsChanged("CODCLT", codClt);
   }

   public BigDecimal getDescontar() {
        return this.getVo().asBigDecimal("DESCONTAR");
   }

   public void setDescontar(BigDecimal descontar) {
        markAsChanged("DESCONTAR", descontar);
   }

   public BigDecimal getNuCll() {
        return this.getVo().asBigDecimal("NUCLL");
   }

   public void setNuCll(BigDecimal nuCll) {
        markAsChanged("NUCLL", nuCll);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getResultado() {
        return this.getVo().asBigDecimal("RESULTADO");
   }

   public void setResultado(BigDecimal resultado) {
        markAsChanged("RESULTADO", resultado);
   }

   public String getAprovadorResultado() {
        return this.getVo().asString("APROVADORESULTADO");
   }

   public void setAprovadorResultado(String aprovadorResultado) {
        markAsChanged("APROVADORESULTADO", aprovadorResultado);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getResultadoConf() {
        return this.getVo().asString("RESULTADOCONF");
   }

   public void setResultadoConf(String resultadoConf) {
        markAsChanged("RESULTADOCONF", resultadoConf);
   }

   @Override
   public String getTableName() {
        return "TGACLR";
   }

   @Override
   public String getEntityName() {
        return "ItemLaudo";
   }

   @Override
   public ItemLaudo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
