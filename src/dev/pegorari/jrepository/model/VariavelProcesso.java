package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class VariavelProcesso implements SankhyaEntity<VariavelProcesso> {

   private String descricao;
   private String escopo;
   private String leitura;
   private String nome;
   private BigDecimal nuEle;
   private BigDecimal nuVar;
   private String obrigatorio;
   private BigDecimal ordem;
   private String tipo;
   private String valorPadrao;
   private String defaultLong;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getEscopo() {
        return escopo;
   }

   public void setEscopo(String escopo) {
        this.escopo = escopo;
   }

   public String getLeitura() {
        return leitura;
   }

   public void setLeitura(String leitura) {
        this.leitura = leitura;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public BigDecimal getNuEle() {
        return nuEle;
   }

   public void setNuEle(BigDecimal nuEle) {
        this.nuEle = nuEle;
   }

   public BigDecimal getNuVar() {
        return nuVar;
   }

   public void setNuVar(BigDecimal nuVar) {
        this.nuVar = nuVar;
   }

   public String getObrigatorio() {
        return obrigatorio;
   }

   public void setObrigatorio(String obrigatorio) {
        this.obrigatorio = obrigatorio;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getValorPadrao() {
        return valorPadrao;
   }

   public void setValorPadrao(String valorPadrao) {
        this.valorPadrao = valorPadrao;
   }

   public String getDefaultLong() {
        return defaultLong;
   }

   public void setDefaultLong(String defaultLong) {
        this.defaultLong = defaultLong;
   }

   @Override
   public String getEntityName() {
        return "VariavelProcesso";
   }

   @Override
   public VariavelProcesso fromVO(DynamicVO vo) {
        this.descricao = vo.asString("DESCRICAO");
        this.escopo = vo.asString("ESCOPO");
        this.leitura = vo.asString("LEITURA");
        this.nome = vo.asString("NOME");
        this.nuEle = vo.asBigDecimal("NUELE");
        this.nuVar = vo.asBigDecimal("NUVAR");
        this.obrigatorio = vo.asString("OBRIGATORIO");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.tipo = vo.asString("TIPO");
        this.valorPadrao = vo.asString("VALORPADRAO");
        this.defaultLong = vo.asString("DEFAULTLONG");
        return this;
   }
}
