package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegistrosEscrituracaoFiscal extends AbstractSankhyaEntity<RegistrosEscrituracaoFiscal> {
   private String bloco;
   private BigDecimal codEmp;
   private String descricao;
   private String gerarEntrada;
   private String gerarRegistro;
   private String gerarSaida;
   private String registro;
   private BigDecimal tipo;

   public String getBloco() {
        return bloco;
   }

   public void setBloco(String bloco) {
        this.bloco = bloco;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getGerarEntrada() {
        return gerarEntrada;
   }

   public void setGerarEntrada(String gerarEntrada) {
        this.gerarEntrada = gerarEntrada;
   }

   public String getGerarRegistro() {
        return gerarRegistro;
   }

   public void setGerarRegistro(String gerarRegistro) {
        this.gerarRegistro = gerarRegistro;
   }

   public String getGerarSaida() {
        return gerarSaida;
   }

   public void setGerarSaida(String gerarSaida) {
        this.gerarSaida = gerarSaida;
   }

   public String getRegistro() {
        return registro;
   }

   public void setRegistro(String registro) {
        this.registro = registro;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TGFEFR";
   }

   @Override
   public String getEntityName() {
        return "RegistrosEscrituracaoFiscal";
   }

   @Override
   public RegistrosEscrituracaoFiscal fromVO(DynamicVO vo) {
        this.bloco = vo.asString("BLOCO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.descricao = vo.asString("DESCRICAO");
        this.gerarEntrada = vo.asString("GERARENTRADA");
        this.gerarRegistro = vo.asString("GERARREGISTRO");
        this.gerarSaida = vo.asString("GERARSAIDA");
        this.registro = vo.asString("REGISTRO");
        this.tipo = vo.asBigDecimal("TIPO");
        return this;
   }
}
