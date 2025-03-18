package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RelacionamentoUsuario extends AbstractSankhyaEntity<RelacionamentoUsuario> {
   private BigDecimal codUsu;
   private BigDecimal codUsuRel;
   private String tipo;
   private String vinculo;
   private String liderImediato;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuRel() {
        return codUsuRel;
   }

   public void setCodUsuRel(BigDecimal codUsuRel) {
        markAsChanged("CODUSUREL", codUsuRel);
        this.codUsuRel = codUsuRel;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getVinculo() {
        return vinculo;
   }

   public void setVinculo(String vinculo) {
        markAsChanged("VINCULO", vinculo);
        this.vinculo = vinculo;
   }

   public String getLiderImediato() {
        return liderImediato;
   }

   public void setLiderImediato(String liderImediato) {
        markAsChanged("LIDERIMEDIATO", liderImediato);
        this.liderImediato = liderImediato;
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
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuRel = vo.asBigDecimal("CODUSUREL");
        this.tipo = vo.asString("TIPO");
        this.vinculo = vo.asString("VINCULO");
        this.liderImediato = vo.asString("LIDERIMEDIATO");
        return this;
   }
}
