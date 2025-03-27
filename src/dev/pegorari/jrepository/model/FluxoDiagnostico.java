package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FluxoDiagnostico extends AbstractSankhyaEntity<FluxoDiagnostico> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodFld() {
        return this.getVo().asBigDecimal("CODFLD");
   }

   public void setCodFld(BigDecimal codFld) {
        markAsChanged("CODFLD", codFld);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public char[] getFluxo() {
        return this.getVo().asClob("FLUXO");
   }

   public void setFluxo(char[] fluxo) {
        markAsChanged("FLUXO", fluxo);
   }

   @Override
   public String getTableName() {
        return "TCSFLD";
   }

   @Override
   public String getEntityName() {
        return "FluxoDiagnostico";
   }

   @Override
   public FluxoDiagnostico fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
