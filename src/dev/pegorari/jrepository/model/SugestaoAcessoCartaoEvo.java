package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SugestaoAcessoCartaoEvo extends AbstractSankhyaEntity<SugestaoAcessoCartaoEvo> {
   public String getAlteradoPeloUsuario() {
        return this.getVo().asString("ALTERADOPELOUSUARIO");
   }

   public void setAlteradoPeloUsuario(String alteradoPeloUsuario) {
        markAsChanged("ALTERADOPELOUSUARIO", alteradoPeloUsuario);
   }

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

   public String getLiberado() {
        return this.getVo().asString("LIBERADO");
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
   }

   public String getResourceId() {
        return this.getVo().asString("RESOURCEID");
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
   }

   @Override
   public String getTableName() {
        return "TSIACE";
   }

   @Override
   public String getEntityName() {
        return "SugestaoAcessoCartaoEvo";
   }

   @Override
   public SugestaoAcessoCartaoEvo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
