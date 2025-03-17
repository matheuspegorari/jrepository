package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Doca implements SankhyaEntity<Doca> {

   private String balcao;
   private String impressoraDoca;
   private BigDecimal altura;
   private String ativo;
   private String descricao;
   private String situacao;
   private String tipDoca;
   private BigDecimal codDoca;
   private BigDecimal codEnd;
   private BigDecimal codEndCrossdock;

   public String getBalcao() {
        return balcao;
   }

   public void setBalcao(String balcao) {
        this.balcao = balcao;
   }

   public String getImpressoraDoca() {
        return impressoraDoca;
   }

   public void setImpressoraDoca(String impressoraDoca) {
        this.impressoraDoca = impressoraDoca;
   }

   public BigDecimal getAltura() {
        return altura;
   }

   public void setAltura(BigDecimal altura) {
        this.altura = altura;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public String getTipDoca() {
        return tipDoca;
   }

   public void setTipDoca(String tipDoca) {
        this.tipDoca = tipDoca;
   }

   public BigDecimal getCodDoca() {
        return codDoca;
   }

   public void setCodDoca(BigDecimal codDoca) {
        this.codDoca = codDoca;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public BigDecimal getCodEndCrossdock() {
        return codEndCrossdock;
   }

   public void setCodEndCrossdock(BigDecimal codEndCrossdock) {
        this.codEndCrossdock = codEndCrossdock;
   }

   @Override
   public String getEntityName() {
        return "Doca";
   }

   @Override
   public Doca fromVO(DynamicVO vo) {
        this.balcao = vo.asString("BALCAO");
        this.impressoraDoca = vo.asString("IMPRESSORADOCA");
        this.altura = vo.asBigDecimal("ALTURA");
        this.ativo = vo.asString("ATIVO");
        this.descricao = vo.asString("DESCRICAO");
        this.situacao = vo.asString("SITUACAO");
        this.tipDoca = vo.asString("TIPDOCA");
        this.codDoca = vo.asBigDecimal("CODDOCA");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codEndCrossdock = vo.asBigDecimal("CODENDCROSSDOCK");
        return this;
   }
}
