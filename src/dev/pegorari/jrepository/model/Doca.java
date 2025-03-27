package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Doca extends AbstractSankhyaEntity<Doca> {
   public String getBalcao() {
        return this.getVo().asString("BALCAO");
   }

   public void setBalcao(String balcao) {
        markAsChanged("BALCAO", balcao);
   }

   public String getImpressoraDoca() {
        return this.getVo().asString("IMPRESSORADOCA");
   }

   public void setImpressoraDoca(String impressoraDoca) {
        markAsChanged("IMPRESSORADOCA", impressoraDoca);
   }

   public BigDecimal getAltura() {
        return this.getVo().asBigDecimal("ALTURA");
   }

   public void setAltura(BigDecimal altura) {
        markAsChanged("ALTURA", altura);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getTipDoca() {
        return this.getVo().asString("TIPDOCA");
   }

   public void setTipDoca(String tipDoca) {
        markAsChanged("TIPDOCA", tipDoca);
   }

   public BigDecimal getCodDoca() {
        return this.getVo().asBigDecimal("CODDOCA");
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodEndCrossdock() {
        return this.getVo().asBigDecimal("CODENDCROSSDOCK");
   }

   public void setCodEndCrossdock(BigDecimal codEndCrossdock) {
        markAsChanged("CODENDCROSSDOCK", codEndCrossdock);
   }

   @Override
   public String getTableName() {
        return "TGWDCA";
   }

   @Override
   public String getEntityName() {
        return "Doca";
   }

   @Override
   public Doca fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
