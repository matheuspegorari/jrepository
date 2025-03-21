package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CaracteristicaClassificacao extends AbstractSankhyaEntity<CaracteristicaClassificacao> {
   private BigDecimal codClc;
   private BigDecimal codClt;
   private BigDecimal descontar;
   private String formulaDesc;
   private BigDecimal maximo;
   private BigDecimal minimo;
   private String observacao;
   private String obrigatorio;
   private String usaIntervalo;
   private String usaIndice;
   private BigDecimal vlrCalcIndice;

   public BigDecimal getCodClc() {
        return codClc;
   }

   public void setCodClc(BigDecimal codClc) {
        markAsChanged("CODCLC", codClc);
        this.codClc = codClc;
   }

   public BigDecimal getCodClt() {
        return codClt;
   }

   public void setCodClt(BigDecimal codClt) {
        markAsChanged("CODCLT", codClt);
        this.codClt = codClt;
   }

   public BigDecimal getDescontar() {
        return descontar;
   }

   public void setDescontar(BigDecimal descontar) {
        markAsChanged("DESCONTAR", descontar);
        this.descontar = descontar;
   }

   public String getFormulaDesc() {
        return formulaDesc;
   }

   public void setFormulaDesc(String formulaDesc) {
        markAsChanged("FORMULADESC", formulaDesc);
        this.formulaDesc = formulaDesc;
   }

   public BigDecimal getMaximo() {
        return maximo;
   }

   public void setMaximo(BigDecimal maximo) {
        markAsChanged("MAXIMO", maximo);
        this.maximo = maximo;
   }

   public BigDecimal getMinimo() {
        return minimo;
   }

   public void setMinimo(BigDecimal minimo) {
        markAsChanged("MINIMO", minimo);
        this.minimo = minimo;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getObrigatorio() {
        return obrigatorio;
   }

   public void setObrigatorio(String obrigatorio) {
        markAsChanged("OBRIGATORIO", obrigatorio);
        this.obrigatorio = obrigatorio;
   }

   public String getUsaIntervalo() {
        return usaIntervalo;
   }

   public void setUsaIntervalo(String usaIntervalo) {
        markAsChanged("USAINTERVALO", usaIntervalo);
        this.usaIntervalo = usaIntervalo;
   }

   public String getUsaIndice() {
        return usaIndice;
   }

   public void setUsaIndice(String usaIndice) {
        markAsChanged("USAINDICE", usaIndice);
        this.usaIndice = usaIndice;
   }

   public BigDecimal getVlrCalcIndice() {
        return vlrCalcIndice;
   }

   public void setVlrCalcIndice(BigDecimal vlrCalcIndice) {
        markAsChanged("VLRCALCINDICE", vlrCalcIndice);
        this.vlrCalcIndice = vlrCalcIndice;
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
        this.setOriginalVO(vo);
        this.codClc = vo.asBigDecimal("CODCLC");
        this.codClt = vo.asBigDecimal("CODCLT");
        this.descontar = vo.asBigDecimal("DESCONTAR");
        this.formulaDesc = vo.asString("FORMULADESC");
        this.maximo = vo.asBigDecimal("MAXIMO");
        this.minimo = vo.asBigDecimal("MINIMO");
        this.observacao = vo.asString("OBSERVACAO");
        this.obrigatorio = vo.asString("OBRIGATORIO");
        this.usaIntervalo = vo.asString("USAINTERVALO");
        this.usaIndice = vo.asString("USAINDICE");
        this.vlrCalcIndice = vo.asBigDecimal("VLRCALCINDICE");
        return this;
   }
}
