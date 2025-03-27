package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasGrupo extends AbstractSankhyaEntity<PrevisaoVendasGrupo> {
   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public String getDescrGrupo() {
        return this.getVo().asString("DESCRGRUPO");
   }

   public void setDescrGrupo(String descrGrupo) {
        markAsChanged("DESCRGRUPO", descrGrupo);
   }

   public String getNomeGrupo() {
        return this.getVo().asString("NOMEGRUPO");
   }

   public void setNomeGrupo(String nomeGrupo) {
        markAsChanged("NOMEGRUPO", nomeGrupo);
   }

   @Override
   public String getTableName() {
        return "TSLIPG";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVendasGrupo";
   }

   @Override
   public PrevisaoVendasGrupo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
