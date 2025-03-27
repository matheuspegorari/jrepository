package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoProcesso extends AbstractSankhyaEntity<GrupoProcesso> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getGrupoPai() {
        return this.getVo().asBigDecimal("GRUPOPAI");
   }

   public void setGrupoPai(BigDecimal grupoPai) {
        markAsChanged("GRUPOPAI", grupoPai);
   }

   public BigDecimal getNuGrupo() {
        return this.getVo().asBigDecimal("NUGRUPO");
   }

   public void setNuGrupo(BigDecimal nuGrupo) {
        markAsChanged("NUGRUPO", nuGrupo);
   }

   @Override
   public String getTableName() {
        return "TWFGRU";
   }

   @Override
   public String getEntityName() {
        return "GrupoProcesso";
   }

   @Override
   public GrupoProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
