package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class GrupoInstalacao implements SankhyaEntity<GrupoInstalacao> {

   private BigDecimal grupo;
   private BigDecimal numContrato;
   private BigDecimal qtdParc;

   public BigDecimal getGrupo() {
        return grupo;
   }

   public void setGrupo(BigDecimal grupo) {
        this.grupo = grupo;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public BigDecimal getQtdParc() {
        return qtdParc;
   }

   public void setQtdParc(BigDecimal qtdParc) {
        this.qtdParc = qtdParc;
   }

   @Override
   public String getEntityName() {
        return "GrupoInstalacao";
   }

   @Override
   public GrupoInstalacao fromVO(DynamicVO vo) {
        this.grupo = vo.asBigDecimal("GRUPO");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.qtdParc = vo.asBigDecimal("QTDPARC");
        return this;
   }
}
