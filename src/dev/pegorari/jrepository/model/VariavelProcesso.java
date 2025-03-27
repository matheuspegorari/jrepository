package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class VariavelProcesso extends AbstractSankhyaEntity<VariavelProcesso> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getEscopo() {
        return this.getVo().asString("ESCOPO");
   }

   public void setEscopo(String escopo) {
        markAsChanged("ESCOPO", escopo);
   }

   public String getLeitura() {
        return this.getVo().asString("LEITURA");
   }

   public void setLeitura(String leitura) {
        markAsChanged("LEITURA", leitura);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public BigDecimal getNuEle() {
        return this.getVo().asBigDecimal("NUELE");
   }

   public void setNuEle(BigDecimal nuEle) {
        markAsChanged("NUELE", nuEle);
   }

   public BigDecimal getNuVar() {
        return this.getVo().asBigDecimal("NUVAR");
   }

   public void setNuVar(BigDecimal nuVar) {
        markAsChanged("NUVAR", nuVar);
   }

   public String getObrigatorio() {
        return this.getVo().asString("OBRIGATORIO");
   }

   public void setObrigatorio(String obrigatorio) {
        markAsChanged("OBRIGATORIO", obrigatorio);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getValorPadrao() {
        return this.getVo().asString("VALORPADRAO");
   }

   public void setValorPadrao(String valorPadrao) {
        markAsChanged("VALORPADRAO", valorPadrao);
   }

   public String getDefaultLong() {
        return this.getVo().asString("DEFAULTLONG");
   }

   public void setDefaultLong(String defaultLong) {
        markAsChanged("DEFAULTLONG", defaultLong);
   }

   @Override
   public String getTableName() {
        return "TWFVAR";
   }

   @Override
   public String getEntityName() {
        return "VariavelProcesso";
   }

   @Override
   public VariavelProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
