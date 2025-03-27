package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MSDPerfil extends AbstractSankhyaEntity<MSDPerfil> {
   public BigDecimal getCodPer() {
        return this.getVo().asBigDecimal("CODPER");
   }

   public void setCodPer(BigDecimal codPer) {
        markAsChanged("CODPER", codPer);
   }

   public String getDescPer() {
        return this.getVo().asString("DESCPER");
   }

   public void setDescPer(String descPer) {
        markAsChanged("DESCPER", descPer);
   }

   public String getEnvUlt() {
        return this.getVo().asString("ENVULT");
   }

   public void setEnvUlt(String envUlt) {
        markAsChanged("ENVULT", envUlt);
   }

   public BigDecimal getIntMin() {
        return this.getVo().asBigDecimal("INTMIN");
   }

   public void setIntMin(BigDecimal intMin) {
        markAsChanged("INTMIN", intMin);
   }

   public String getNomePer() {
        return this.getVo().asString("NOMEPER");
   }

   public void setNomePer(String nomePer) {
        markAsChanged("NOMEPER", nomePer);
   }

   public char[] getQueryListaDest() {
        return this.getVo().asClob("QUERYLISTADEST");
   }

   public void setQueryListaDest(char[] queryListaDest) {
        markAsChanged("QUERYLISTADEST", queryListaDest);
   }

   public String getUsaQueryLista() {
        return this.getVo().asString("USAQUERYLISTA");
   }

   public void setUsaQueryLista(String usaQueryLista) {
        markAsChanged("USAQUERYLISTA", usaQueryLista);
   }

   @Override
   public String getTableName() {
        return "TMDPER";
   }

   @Override
   public String getEntityName() {
        return "MSDPerfil";
   }

   @Override
   public MSDPerfil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
