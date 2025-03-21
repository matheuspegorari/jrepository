package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CabecalhoSLA extends AbstractSankhyaEntity<CabecalhoSLA> {
   private BigDecimal codCargaHor;
   private String descricao;
   private BigDecimal nuSla;
   private String tipoFiltro;

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
        this.codCargaHor = codCargaHor;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getNuSla() {
        return nuSla;
   }

   public void setNuSla(BigDecimal nuSla) {
        markAsChanged("NUSLA", nuSla);
        this.nuSla = nuSla;
   }

   public String getTipoFiltro() {
        return tipoFiltro;
   }

   public void setTipoFiltro(String tipoFiltro) {
        markAsChanged("TIPOFILTRO", tipoFiltro);
        this.tipoFiltro = tipoFiltro;
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
        this.setOriginalVO(vo);
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.descricao = vo.asString("DESCRICAO");
        this.nuSla = vo.asBigDecimal("NUSLA");
        this.tipoFiltro = vo.asString("TIPOFILTRO");
        return this;
   }
}
