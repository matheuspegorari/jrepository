package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CabecalhoSLA extends AbstractSankhyaEntity<CabecalhoSLA> {
   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getNuSla() {
        return this.getVo().asBigDecimal("NUSLA");
   }

   public void setNuSla(BigDecimal nuSla) {
        markAsChanged("NUSLA", nuSla);
   }

   public String getTipoFiltro() {
        return this.getVo().asString("TIPOFILTRO");
   }

   public void setTipoFiltro(String tipoFiltro) {
        markAsChanged("TIPOFILTRO", tipoFiltro);
   }

   @Override
   public String getTableName() {
        return "TCSSLA";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoSLA";
   }

   @Override
   public CabecalhoSLA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
