package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ExcecoesCamposLgpd implements SankhyaEntity<ExcecoesCamposLgpd> {

   private BigDecimal codCla;
   private BigDecimal codUsu;
   private String nomeCampo;
   private String nomeTab;
   private String tipoVisu;

   public BigDecimal getCodCla() {
        return codCla;
   }

   public void setCodCla(BigDecimal codCla) {
        this.codCla = codCla;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getNomeCampo() {
        return nomeCampo;
   }

   public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
   }

   public String getNomeTab() {
        return nomeTab;
   }

   public void setNomeTab(String nomeTab) {
        this.nomeTab = nomeTab;
   }

   public String getTipoVisu() {
        return tipoVisu;
   }

   public void setTipoVisu(String tipoVisu) {
        this.tipoVisu = tipoVisu;
   }

   @Override
   public String getEntityName() {
        return "ExcecoesCamposLgpd";
   }

   @Override
   public ExcecoesCamposLgpd fromVO(DynamicVO vo) {
        this.codCla = vo.asBigDecimal("CODCLA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nomeCampo = vo.asString("NOMECAMPO");
        this.nomeTab = vo.asString("NOMETAB");
        this.tipoVisu = vo.asString("TIPOVISU");
        return this;
   }
}
