package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PerfilUsuarioEvo implements SankhyaEntity<PerfilUsuarioEvo> {

   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private String perfil;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getPerfil() {
        return perfil;
   }

   public void setPerfil(String perfil) {
        this.perfil = perfil;
   }

   @Override
   public String getEntityName() {
        return "PerfilUsuarioEvo";
   }

   @Override
   public PerfilUsuarioEvo fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.perfil = vo.asString("PERFIL");
        return this;
   }
}
