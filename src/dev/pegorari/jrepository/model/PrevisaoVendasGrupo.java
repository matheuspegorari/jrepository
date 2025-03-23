package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasGrupo extends AbstractSankhyaEntity<PrevisaoVendasGrupo> {
   private BigDecimal codGrupo;
   private String descrGrupo;
   private String nomeGrupo;

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public String getDescrGrupo() {
        return descrGrupo;
   }

   public void setDescrGrupo(String descrGrupo) {
        markAsChanged("DESCRGRUPO", descrGrupo);
        this.descrGrupo = descrGrupo;
   }

   public String getNomeGrupo() {
        return nomeGrupo;
   }

   public void setNomeGrupo(String nomeGrupo) {
        markAsChanged("NOMEGRUPO", nomeGrupo);
        this.nomeGrupo = nomeGrupo;
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
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.descrGrupo = vo.asString("DESCRGRUPO");
        this.nomeGrupo = vo.asString("NOMEGRUPO");
        return this;
   }
}
