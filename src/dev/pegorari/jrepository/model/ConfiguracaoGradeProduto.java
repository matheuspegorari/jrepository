package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoGradeProduto extends AbstractSankhyaEntity<ConfiguracaoGradeProduto> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhCad() {
        return this.getVo().asTimestamp("DHCAD");
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
   }

   public BigDecimal getIdGrade() {
        return this.getVo().asBigDecimal("IDGRADE");
   }

   public void setIdGrade(BigDecimal idGrade) {
        markAsChanged("IDGRADE", idGrade);
   }

   public String getNomGrd() {
        return this.getVo().asString("NOMGRD");
   }

   public void setNomGrd(String nomGrd) {
        markAsChanged("NOMGRD", nomGrd);
   }

   public String getAtuNuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtuNuVersao(String atuNuVersao) {
        markAsChanged("ATUNUVERSAO", atuNuVersao);
   }

   public BigDecimal getNuVersao() {
        return this.getVo().asBigDecimal("NUVERSAO");
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
   }

   public String getUsaMascara() {
        return this.getVo().asString("USAMASCARA");
   }

   public void setUsaMascara(String usaMascara) {
        markAsChanged("USAMASCARA", usaMascara);
   }

   @Override
   public String getTableName() {
        return "TGFGRD";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoGradeProduto";
   }

   @Override
   public ConfiguracaoGradeProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
