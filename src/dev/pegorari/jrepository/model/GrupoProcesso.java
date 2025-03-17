package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class GrupoProcesso implements SankhyaEntity<GrupoProcesso> {

   private BigDecimal codUsu;
   private String descricao;
   private BigDecimal grupoPai;
   private BigDecimal nuGrupo;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getGrupoPai() {
        return grupoPai;
   }

   public void setGrupoPai(BigDecimal grupoPai) {
        this.grupoPai = grupoPai;
   }

   public BigDecimal getNuGrupo() {
        return nuGrupo;
   }

   public void setNuGrupo(BigDecimal nuGrupo) {
        this.nuGrupo = nuGrupo;
   }

   @Override
   public String getEntityName() {
        return "GrupoProcesso";
   }

   @Override
   public GrupoProcesso fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descricao = vo.asString("DESCRICAO");
        this.grupoPai = vo.asBigDecimal("GRUPOPAI");
        this.nuGrupo = vo.asBigDecimal("NUGRUPO");
        return this;
   }
}
