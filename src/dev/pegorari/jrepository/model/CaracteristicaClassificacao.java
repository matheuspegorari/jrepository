package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CaracteristicaClassificacao extends AbstractSankhyaEntity<CaracteristicaClassificacao> {
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

   public String getFormulaDesc() {
        return this.getVo().asString("FORMULADESC");
   }

   public void setFormulaDesc(String formulaDesc) {
        markAsChanged("FORMULADESC", formulaDesc);
   }

   public BigDecimal getMaximo() {
        return this.getVo().asBigDecimal("MAXIMO");
   }

   public void setMaximo(BigDecimal maximo) {
        markAsChanged("MAXIMO", maximo);
   }

   public BigDecimal getMinimo() {
        return this.getVo().asBigDecimal("MINIMO");
   }

   public void setMinimo(BigDecimal minimo) {
        markAsChanged("MINIMO", minimo);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getObrigatorio() {
        return this.getVo().asString("OBRIGATORIO");
   }

   public void setObrigatorio(String obrigatorio) {
        markAsChanged("OBRIGATORIO", obrigatorio);
   }

   public String getUsaIntervalo() {
        return this.getVo().asString("USAINTERVALO");
   }

   public void setUsaIntervalo(String usaIntervalo) {
        markAsChanged("USAINTERVALO", usaIntervalo);
   }

   public String getUsaIndice() {
        return this.getVo().asString("USAINDICE");
   }

   public void setUsaIndice(String usaIndice) {
        markAsChanged("USAINDICE", usaIndice);
   }

   public BigDecimal getVlrCalcIndice() {
        return this.getVo().asBigDecimal("VLRCALCINDICE");
   }

   public void setVlrCalcIndice(BigDecimal vlrCalcIndice) {
        markAsChanged("VLRCALCINDICE", vlrCalcIndice);
   }

   @Override
   public String getTableName() {
        return "TGACLI";
   }

   @Override
   public String getEntityName() {
        return "CaracteristicaClassificacao";
   }

   @Override
   public CaracteristicaClassificacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
