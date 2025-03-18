package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SugestaoAcessoCartaoEvo extends AbstractSankhyaEntity<SugestaoAcessoCartaoEvo> {
   private String alteradoPeloUsuario;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private String liberado;
   private String resourceId;

   public String getAlteradoPeloUsuario() {
        return alteradoPeloUsuario;
   }

   public void setAlteradoPeloUsuario(String alteradoPeloUsuario) {
        markAsChanged("ALTERADOPELOUSUARIO", alteradoPeloUsuario);
        this.alteradoPeloUsuario = alteradoPeloUsuario;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public String getLiberado() {
        return liberado;
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
        this.liberado = liberado;
   }

   public String getResourceId() {
        return resourceId;
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
        this.resourceId = resourceId;
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
        this.setOriginalVO(vo);
        this.alteradoPeloUsuario = vo.asString("ALTERADOPELOUSUARIO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.liberado = vo.asString("LIBERADO");
        this.resourceId = vo.asString("RESOURCEID");
        return this;
   }
}
