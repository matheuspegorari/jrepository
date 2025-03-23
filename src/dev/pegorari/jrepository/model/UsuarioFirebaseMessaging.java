package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class UsuarioFirebaseMessaging extends AbstractSankhyaEntity<UsuarioFirebaseMessaging> {
   private String codFcm;
   private Timestamp dhRegistro;
   private BigDecimal codUsu;
   private String codApp;
   private String plataforma;

   public String getCodFcm() {
        return codFcm;
   }

   public void setCodFcm(String codFcm) {
        markAsChanged("CODFCM", codFcm);
        this.codFcm = codFcm;
   }

   public Timestamp getDhRegistro() {
        return dhRegistro;
   }

   public void setDhRegistro(Timestamp dhRegistro) {
        markAsChanged("DHREGISTRO", dhRegistro);
        this.dhRegistro = dhRegistro;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getCodApp() {
        return codApp;
   }

   public void setCodApp(String codApp) {
        markAsChanged("CODAPP", codApp);
        this.codApp = codApp;
   }

   public String getPlataforma() {
        return plataforma;
   }

   public void setPlataforma(String plataforma) {
        markAsChanged("PLATAFORMA", plataforma);
        this.plataforma = plataforma;
   }

   @Override
   public String getTableName() {
        return "TSIFCM";
   }

   @Override
   public String getEntityName() {
        return "UsuarioFirebaseMessaging";
   }

   @Override
   public UsuarioFirebaseMessaging fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codFcm = vo.asString("CODFCM");
        this.dhRegistro = vo.asTimestamp("DHREGISTRO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codApp = vo.asString("CODAPP");
        this.plataforma = vo.asString("PLATAFORMA");
        return this;
   }
}
