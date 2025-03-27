package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegistrosEscrituracaoFiscal extends AbstractSankhyaEntity<RegistrosEscrituracaoFiscal> {
   public String getBloco() {
        return this.getVo().asString("BLOCO");
   }

   public void setBloco(String bloco) {
        markAsChanged("BLOCO", bloco);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getGerarEntrada() {
        return this.getVo().asString("GERARENTRADA");
   }

   public void setGerarEntrada(String gerarEntrada) {
        markAsChanged("GERARENTRADA", gerarEntrada);
   }

   public String getGerarRegistro() {
        return this.getVo().asString("GERARREGISTRO");
   }

   public void setGerarRegistro(String gerarRegistro) {
        markAsChanged("GERARREGISTRO", gerarRegistro);
   }

   public String getGerarSaida() {
        return this.getVo().asString("GERARSAIDA");
   }

   public void setGerarSaida(String gerarSaida) {
        markAsChanged("GERARSAIDA", gerarSaida);
   }

   public String getRegistro() {
        return this.getVo().asString("REGISTRO");
   }

   public void setRegistro(String registro) {
        markAsChanged("REGISTRO", registro);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
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
        this.setVo(vo);
        return this;
   }
}
