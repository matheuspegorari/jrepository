package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ColetaEntregaPorNota extends AbstractSankhyaEntity<ColetaEntregaPorNota> {
   public String getCgcCpf() {
        return this.getVo().asString("CGC_CPF");
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
   }

   public BigDecimal getCodMunFis() {
        return this.getVo().asBigDecimal("CODMUNFIS");
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        markAsChanged("CODMUNFIS", codMunFis);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public String getInscEstad() {
        return this.getVo().asString("INSCESTAD");
   }

   public void setInscEstad(String inscEstad) {
        markAsChanged("INSCESTAD", inscEstad);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getTipoTransp() {
        return this.getVo().asBigDecimal("TIPOTRANSP");
   }

   public void setTipoTransp(BigDecimal tipoTransp) {
        markAsChanged("TIPOTRANSP", tipoTransp);
   }

   @Override
   public String getTableName() {
        return "TGFNCE";
   }

   @Override
   public String getEntityName() {
        return "ColetaEntregaPorNota";
   }

   @Override
   public ColetaEntregaPorNota fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
