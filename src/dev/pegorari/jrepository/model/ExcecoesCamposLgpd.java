package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExcecoesCamposLgpd extends AbstractSankhyaEntity<ExcecoesCamposLgpd> {
   public BigDecimal getCodCla() {
        return this.getVo().asBigDecimal("CODCLA");
   }

   public void setCodCla(BigDecimal codCla) {
        markAsChanged("CODCLA", codCla);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getNomeCampo() {
        return this.getVo().asString("NOMECAMPO");
   }

   public void setNomeCampo(String nomeCampo) {
        markAsChanged("NOMECAMPO", nomeCampo);
   }

   public String getNomeTab() {
        return this.getVo().asString("NOMETAB");
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
   }

   public String getTipoVisu() {
        return this.getVo().asString("TIPOVISU");
   }

   public void setTipoVisu(String tipoVisu) {
        markAsChanged("TIPOVISU", tipoVisu);
   }

   @Override
   public String getTableName() {
        return "TSIEXC";
   }

   @Override
   public String getEntityName() {
        return "ExcecoesCamposLgpd";
   }

   @Override
   public ExcecoesCamposLgpd fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
