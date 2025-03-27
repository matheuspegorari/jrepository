package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoInstalacao extends AbstractSankhyaEntity<GrupoInstalacao> {
   public BigDecimal getGrupo() {
        return this.getVo().asBigDecimal("GRUPO");
   }

   public void setGrupo(BigDecimal grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getQtdParc() {
        return this.getVo().asBigDecimal("QTDPARC");
   }

   public void setQtdParc(BigDecimal qtdParc) {
        markAsChanged("QTDPARC", qtdParc);
   }

   @Override
   public String getTableName() {
        return "TCSCGR";
   }

   @Override
   public String getEntityName() {
        return "GrupoInstalacao";
   }

   @Override
   public GrupoInstalacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
