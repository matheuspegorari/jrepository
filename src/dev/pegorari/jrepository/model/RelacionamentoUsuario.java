package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelacionamentoUsuario extends AbstractSankhyaEntity<RelacionamentoUsuario> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuRel() {
        return this.getVo().asBigDecimal("CODUSUREL");
   }

   public void setCodUsuRel(BigDecimal codUsuRel) {
        markAsChanged("CODUSUREL", codUsuRel);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getVinculo() {
        return this.getVo().asString("VINCULO");
   }

   public void setVinculo(String vinculo) {
        markAsChanged("VINCULO", vinculo);
   }

   public String getLiderImediato() {
        return this.getVo().asString("LIDERIMEDIATO");
   }

   public void setLiderImediato(String liderImediato) {
        markAsChanged("LIDERIMEDIATO", liderImediato);
   }

   @Override
   public String getTableName() {
        return "TCSRUS";
   }

   @Override
   public String getEntityName() {
        return "RelacionamentoUsuario";
   }

   @Override
   public RelacionamentoUsuario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
