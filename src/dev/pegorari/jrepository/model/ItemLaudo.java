package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemLaudo extends AbstractSankhyaEntity<ItemLaudo> {
   private BigDecimal codClc;
   private BigDecimal codClt;
   private BigDecimal descontar;
   private BigDecimal nuCll;
   private String observacao;
   private BigDecimal resultado;
   private String aprovadorResultado;
   private BigDecimal ordem;
   private String resultadoConf;

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

   public BigDecimal getNuCll() {
        return nuCll;
   }

   public void setNuCll(BigDecimal nuCll) {
        markAsChanged("NUCLL", nuCll);
        this.nuCll = nuCll;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getResultado() {
        return resultado;
   }

   public void setResultado(BigDecimal resultado) {
        markAsChanged("RESULTADO", resultado);
        this.resultado = resultado;
   }

   public String getAprovadorResultado() {
        return aprovadorResultado;
   }

   public void setAprovadorResultado(String aprovadorResultado) {
        markAsChanged("APROVADORESULTADO", aprovadorResultado);
        this.aprovadorResultado = aprovadorResultado;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public String getResultadoConf() {
        return resultadoConf;
   }

   public void setResultadoConf(String resultadoConf) {
        markAsChanged("RESULTADOCONF", resultadoConf);
        this.resultadoConf = resultadoConf;
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
        this.codClc = vo.asBigDecimal("CODCLC");
        this.codClt = vo.asBigDecimal("CODCLT");
        this.descontar = vo.asBigDecimal("DESCONTAR");
        this.nuCll = vo.asBigDecimal("NUCLL");
        this.observacao = vo.asString("OBSERVACAO");
        this.resultado = vo.asBigDecimal("RESULTADO");
        this.aprovadorResultado = vo.asString("APROVADORESULTADO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.resultadoConf = vo.asString("RESULTADOCONF");
        return this;
   }
}
