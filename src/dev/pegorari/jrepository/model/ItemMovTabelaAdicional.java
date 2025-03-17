package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItemMovTabelaAdicional implements SankhyaEntity<ItemMovTabelaAdicional> {

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
        this.codClc = codClc;
   }

   public BigDecimal getCodClt() {
        return codClt;
   }

   public void setCodClt(BigDecimal codClt) {
        this.codClt = codClt;
   }

   public BigDecimal getDescontar() {
        return descontar;
   }

   public void setDescontar(BigDecimal descontar) {
        this.descontar = descontar;
   }

   public BigDecimal getNuCll() {
        return nuCll;
   }

   public void setNuCll(BigDecimal nuCll) {
        this.nuCll = nuCll;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getResultado() {
        return resultado;
   }

   public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
   }

   public String getAprovadorResultado() {
        return aprovadorResultado;
   }

   public void setAprovadorResultado(String aprovadorResultado) {
        this.aprovadorResultado = aprovadorResultado;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getResultadoConf() {
        return resultadoConf;
   }

   public void setResultadoConf(String resultadoConf) {
        this.resultadoConf = resultadoConf;
   }

   @Override
   public String getEntityName() {
        return "ItemMovTabelaAdicional";
   }

   @Override
   public ItemMovTabelaAdicional fromVO(DynamicVO vo) {
        this.codClc = vo.asBigDecimal("CODCLC");
        this.codClt = vo.asBigDecimal("CODCLT");
        this.descontar = vo.asBigDecimal("DESCONTAR");
        this.nuCll = vo.asBigDecimal("NUCLL");
        this.observacao = vo.asString("OBSERVACAO");
        this.resultado = vo.asBigDecimal("RESULTADO");
        this.aprovadorResultado = vo.asString("APROVADORRESULTADO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.resultadoConf = vo.asString("RESULTADOCONF");
        return this;
   }
}
