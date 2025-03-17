package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FluxoDiagnostico extends AbstractSankhyaEntity<FluxoDiagnostico> {
   private String ativo;
   private BigDecimal codFld;
   private String descricao;
   private char[] fluxo;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodFld() {
        return codFld;
   }

   public void setCodFld(BigDecimal codFld) {
        this.codFld = codFld;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public char[] getFluxo() {
        return fluxo;
   }

   public void setFluxo(char[] fluxo) {
        this.fluxo = fluxo;
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
        this.ativo = vo.asString("ATIVO");
        this.codFld = vo.asBigDecimal("CODFLD");
        this.descricao = vo.asString("DESCRICAO");
        this.fluxo = vo.asClob("FLUXO");
        return this;
   }
}
