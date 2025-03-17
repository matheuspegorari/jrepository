package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ConsolidacaoAcessos implements SankhyaEntity<ConsolidacaoAcessos> {

   private BigDecimal codUsu;
   private BigDecimal codGrupo;
   private String consultar;
   private BigDecimal codConfig;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public String getConsultar() {
        return consultar;
   }

   public void setConsultar(String consultar) {
        this.consultar = consultar;
   }

   public BigDecimal getCodConfig() {
        return codConfig;
   }

   public void setCodConfig(BigDecimal codConfig) {
        this.codConfig = codConfig;
   }

   @Override
   public String getEntityName() {
        return "ConsolidacaoAcessos";
   }

   @Override
   public ConsolidacaoAcessos fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.consultar = vo.asString("CONSULTAR");
        this.codConfig = vo.asBigDecimal("CODCONFIG");
        return this;
   }
}
