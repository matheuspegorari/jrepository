package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PerfilUsuarioEvo extends AbstractSankhyaEntity<PerfilUsuarioEvo> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getPerfil() {
        return this.getVo().asString("PERFIL");
   }

   public void setPerfil(String perfil) {
        markAsChanged("PERFIL", perfil);
   }

   @Override
   public String getTableName() {
        return "TSIPUE";
   }

   @Override
   public String getEntityName() {
        return "PerfilUsuarioEvo";
   }

   @Override
   public PerfilUsuarioEvo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
