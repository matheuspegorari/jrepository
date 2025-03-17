package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVendasGrupo implements SankhyaEntity<PrevisaoVendasGrupo> {

   private BigDecimal codGrupo;
   private String descrGrupo;
   private String nomeGrupo;

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public String getDescrGrupo() {
        return descrGrupo;
   }

   public void setDescrGrupo(String descrGrupo) {
        this.descrGrupo = descrGrupo;
   }

   public String getNomeGrupo() {
        return nomeGrupo;
   }

   public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVendasGrupo";
   }

   @Override
   public PrevisaoVendasGrupo fromVO(DynamicVO vo) {
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.descrGrupo = vo.asString("DESCRGRUPO");
        this.nomeGrupo = vo.asString("NOMEGRUPO");
        return this;
   }
}
